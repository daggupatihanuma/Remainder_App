import React, { createContext } from "react";
import all_product from '../Components/Asset/all_product';

export const ShopContext = createContext();

const ShopContextprovider = (props) => {
    const contextvalue ={all_product};
    return(
        <ShopContext.provider value={contextvalue}>
            {props.children}
        </ShopContext.provider>
    )
}

export default ShopContextprovider;