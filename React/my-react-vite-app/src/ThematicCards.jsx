
import React from "react";
import { useNavigate } from "react-router-dom";

export default function ThematicCards({ theme, themeIndex }) {
    

    const navigate = useNavigate();

    return (
        <div className="w-64 h-48 mx-auto rounded-xl shadow-lg hover:shadow-xl cursor-pointer mb-10 sm:mb-0 bg-secondary-light"
        onClick={() => navigate(`/subthematic/${theme}`)}>
            <div className="flex justify-center items-center h-full bg-blue-200 p-4">
                <p className="font-semibold capitalize text-md md:text-lg text-ternary-dark text-center">
                    {theme}
                </p>
            </div>
        </div>
    );
}
