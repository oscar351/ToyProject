import React from 'react';
import 'bootstrap/dist/css/bootstrap.min.css'
import './App.css';
import MainComponent from './main/MainComponent';
import { BrowserRouter } from 'react-router-dom';

function App() {
  return (
    <BrowserRouter>
        <MainComponent/>
    </BrowserRouter>
);
}

export default App;
