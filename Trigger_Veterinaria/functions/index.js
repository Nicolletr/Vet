const functions = require("firebase-functions");
const admin = require("firebase-admin");
admin.initializeApp();
const db = admin.firestore();

exports.onUserCreate = functions.firestore.document('cliente/{id_cliente}').onCreate(async (snap, context) => {
    const values = snap.data();
    const query = db.collection("cliente");
    const snapshot = await query.where("id_cliente", "==", values.id_cliente).get();
    let trigger_cliente = 0;
    snapshot.forEach(querysnapshot => {
      trigger_cliente = querysnapshot.data().antiguedad
    });
    console.log(trigger_cliente);
    if (trigger_cliente > 5) {
        try {
            await db.collection('cliente').doc(snap.id).delete();
        } catch (error) {
            console.log(error);
        }
    }
})
