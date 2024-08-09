// src/Card.js
import React from 'react';
import './card.css';

const Card = ({ title, image ,className}) => {
  return (
    <div className={`card ${className}`}>
      <img src={image} alt={title} />
      <div className="card-content">
        <h2>{title}</h2>
        
      </div>
    </div>
  );
};

export default Card;
