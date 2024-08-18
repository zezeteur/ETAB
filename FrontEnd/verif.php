<?php

// Vérifier si le formulaire de connexion a été soumis
if ($_SERVER["REQUEST_METHOD"] == "POST") {

    // Variables d'entrée du formulaire
    $username = $_POST["username"];
    $password = $_POST["password"];

    // Connexion à la base de données MySQL
    $host = "localhost"; // Nom du serveur MySQL
    $dbname = "etab_db"; // Nom de la base de données MySQL
    $db_username = "root"; // Nom d'utilisateur MySQL
    $db_password = ""; // Mot de passe MySQL

    try {
        $pdo = new PDO("mysql:host=$host;dbname=$dbname", $db_username, $db_password);
        $pdo->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);
    } catch(PDOException $e) {
        header("Location: pages-error-404.php");
    exit();
    }

    // Requête SQL pour récupérer l'utilisateur
    $query = "SELECT id FROM utilisateur WHERE pseudo = ? AND motDePasse = ?";

    try {
        $stmt = $pdo->prepare($query);
        $stmt->execute([$username, $password]);
        $user = $stmt->fetch();
    } catch(PDOException $e) {
       header("Location: pages-error-404.php");
    exit();
    }

    // Vérifier si l'utilisateur existe dans la base de données
    if ($user) {
        // Démarrez la session de l'utilisateur
        session_start();
        $_SESSION["user_id"] = $user["id"];
        // Rediriger vers la page d'accueil
        header("Location: index.html");
        exit();
    } else {
        // Afficher un message d'erreur si l'utilisateur n'existe pas
           header("Location: login-error.php");
          exit();
    }


    // Fermer la connexion PDO
    $pdo = null;
}
?>























