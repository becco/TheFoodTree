<?php
include ('config.php');
include ('db.class.php');

if (isset($_POST)) {
    $db = new DB($database, $host, $user, $password);
    
    $jsonString = $_POST['json'];
    
    $jArray = json_decode($jsonString, true);
    
    try {
        foreach ($jArray as $obj) {
            $ingredient_id = $obj['ingredient_id'];
            $name = $obj['name'];
            $total_cost = $obj['total_cost'];
            $category_id = $obj['category_id'];
            $date = $obj['date'];
            $reason_id = $obj['reason_id'];
            $other_reason_id = $obj['other_reason_id'];
            
            $db2 = new DB($database, $host, $user, $password);
            $db2->execute("INSERT INTO items (ingredient_id, name, total_cost, category_id, date, reason_id, other_reason_id) VALUES ($ingredient_id, '$name', $total_cost, $category_id, '$date', $reason_id, $other_reason_id)");
            //$response[] = $db2->lastInsertedId();
        }
        // $response = ['status'=>'success'];
        // echo json_encode($response);
        echo 'success';
    }
    catch(Exception $e) {
        // $response = ['status'=>'oops'];
        // echo json_encode($response);
        echo 'oops';
    }
    
    
}
?>