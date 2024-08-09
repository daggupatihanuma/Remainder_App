// src/App.js
import React from 'react';
import Card from './components/card';
import './App.css';

const cardsData = [
  {
    
    image: './images/image1.jpg',
    className: 'computer-font',
  },
  {
    
    image: './images/image1.jpg',
    
  },
  {
    
    image: './images/image1.jpg',
   
  },
  {
    
    image: './images/image1.jpg',
    
  },
  {
    
    image: './images/image1.jpg',
    
  },
  {
    
    image: './images/image1.jpg',
    
  },
  {
    
    image: './images/image1.jpg',
    
  },
  {
    
    image: './images/image1.jpg',
    
  },
  {
    
    image: './images/image1.jpg',
    
  },
  {
    
    image: './images/image1.jpg',
    
  },
  

];

const App = () => {
  return (
    <div className="App">
      <h1>REPOSITORY OF DATASETS</h1>
      <div className="cards-container">
        {cardsData.map((card, index) => (
          <Card
            key={index}
            title={card.title}
            image={card.image}
            className={card.className}
          />
        ))}
      </div>
    </div>
  );
};

export default App;
