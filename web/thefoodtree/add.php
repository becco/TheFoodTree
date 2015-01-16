<?php
include ('config.php');
include ('db.class.php');

if (isset($_POST['username'])) {
    $email = $_POST['username'];
    
    $db = new DB($database, $host, $user, $password);
    
    try {
        
        $ingredient_id = $_POST['ingredient_id'];
        $name = $_POST['name'];
        $total_cost = $_POST['total_cost'];
        $category_id = $_POST['category_id'];
        $date = $_POST['date'];
        $reason_id = $_POST['reason_id'];
        $other_reason_id = $_POST['other_reason_id'];
        
        $db2 = new DB($database, $host, $user, $password);
        $db2->execute("INSERT INTO items (ingredient_id, name, total_cost, category_id, date, reason_id, other_reason_id) VALUES ($ingredient_id, '$name', $total_cost, $category_id, '$date', $reason_id, $other_reason_id)");
    
    	return "{'status':'ok'}";
    }
    catch(Exception $e) {
        
        //echo "Exception: ".$e;
        echo "There was an error, please try again!";
        return "{'status':'oops'}";

    }
}
?>