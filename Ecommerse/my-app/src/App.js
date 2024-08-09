import './App.css';
import React from 'react';
import Navbar from './Components/Navbar/Navbar/Navbar';
import Shop from './Pages/Shop';  // Adjust the path according to your project structure
import ShopCategory from './Pages/ShopCategory';
import Product from './Pages/Product';
import Cart from './Pages/Cart';
import LoginSignup from './Pages/LoginSignup';
import { BrowserRouter, Routes, Route } from 'react-router-dom';
import Footer from './Components/Footer/Footer';
import men_banner from './Components/Asset/banner_mens.png';
import women_banner from'./Components/Asset/banner_women.png';
import kid_banner from './Components/Asset/banner_kids.png';

function App() {
  return (
    <div className="App">
      <BrowserRouter>
      <Navbar/>
      <Routes>
        <Route path='/' element={<Shop/>}/>
        <Route path='/mens' element={<ShopCategory banner={men_banner} category="mens"/>}/>
        <Route path='/womens' element={<ShopCategory banner={women_banner} category="womens"/>}/>
        <Route path='/kids' element={<ShopCategory banner={kid_banner}  category="kids"/>}/>
        <Route path="/product" element={<Product/>}>
        <Route path=':productID' element={<Product/>}/>

        
        </Route>
        <Route path='/cart' element={<Cart/>}/>
        <Route path='/login' element={<LoginSignup/>}/>
      </Routes>
      <Footer/>
      </BrowserRouter>
      
    </div>
  );
}

export default App;
