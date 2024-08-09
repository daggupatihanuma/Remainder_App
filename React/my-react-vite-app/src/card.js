import React from 'react';

const Card = () => {
  return (
    <div className="max-w-sm mx-auto bg-white shadow-lg rounded-lg overflow-hidden">
      <img className="w-full h-48 object-cover object-center" src="https://via.placeholder.com/400x300" alt="Card Image" />
      <div className="p-6">
        <h2 className="text-xl font-bold text-gray-800">Card Title</h2>
        <p className="text-gray-600 mt-2">This is a sample description for the card. It provides brief details about the content of the card.</p>
        <div className="mt-4">
          <button className="px-4 py-2 bg-blue-500 text-white text-sm font-medium rounded hover:bg-blue-600 focus:outline-none focus:bg-blue-600">
            Read More
          </button>
        </div>
      </div>
    </div>
  );
}

export default Card;
