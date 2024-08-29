
   var deleteId = null;
//    const openModalDelete = document.getElementById("openModalDelete")
//    console.log(openModalDelete)


    function openModalDelete(id) {
        console.log("ID reçu pour suppression:" , id); // Affiche l'ID dans la console pour débogage
        deleteId = id;
        document.getElementById("closeModal").style.display = "flex";
    }

    function closeModal() {
        const closeModal = document.getElementById("closeModal");
        closeModal.style.display = "none";


    }

    function deleteStudent() {
        fetch(`/students/delete/${deleteId}`, {
            method: 'GET',
        }).then(response => {
            if (response.ok) {
                console.log('Teacher deleted successfully');
                location.reload(); // Recharge la page après suppression
            } else {
                console.log('Error deleting teacher');
            }
        });
    }

     function deleteTeacher() {
            fetch(`/teachers/delete/${deleteId}`, {
                method: 'GET',
            }).then(response => {
                if (response.ok) {
                    console.log('Teacher deleted successfully');
                    location.reload(); // Recharge la page après suppression
                } else {
                    console.log('Error deleting teacher');
                }
            });
        }


