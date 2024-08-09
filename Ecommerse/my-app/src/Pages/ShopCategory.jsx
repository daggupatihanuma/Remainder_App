import React, { useContext, createContext } from 'react'
import './CSS/ShopCategory.css'
import { ShopContext } from '../Context/ShopContext'
 const ShopCategory = (props) => {
  const {all_product} = useContext(ShopContext);
  return (
    <div className='shop-category'>
        <img src={props.banner} alt="" />
        {all_product.map((product,index)=>(
          <li key={index}>{product.name}</li>
        ))}
    </div>
  );
};
export default ShopCategory