import React from "react";
import { Routes, Navigate, Route } from "react-router-dom";
import LoginComponent from "./LoginComponent";
import BoardComponent from "./BoardComponent";

function MainComponent() {   

    let isAuthorized = sessionStorage.getItem("isAuthorized");

  return (
    <div>
      {!isAuthorized ? <Navigate to="/login" /> : <Navigate to="/" />}
        <Routes>
	        <Route path="/login" element={<LoginComponent />} />
	        <Route path="/" element={<BoardComponent />} />
        </Routes>
    </div>
  );
}

export default MainComponent