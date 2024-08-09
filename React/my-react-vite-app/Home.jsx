
import ThematicCards from "./src/ThematicCards";
import logo from "./assets/logo.png";
import { useNavigate } from "react-router-dom";
import data from "../DataJS/data.json";

export default function Home() {
  const navigate = useNavigate();

  // Assign thematic areas to themes
  const themes = data.thematic_areas.map((thematicArea) => thematicArea.name);
//   console.log(themes);

  return (
    <div>
      <div className="fixed w-full border border-l-1 shadow-sm bg-white">
        <img
          src={logo}
          alt="logo"
          className="m-8 h-10 cursor-pointer"
          onClick={() => navigate("/")}
        />
      </div>
      <div className="px-16 pt-36">
        <h1 className="text-4xl font-bold text-blue-rgba text-center mb-16">
          REPOSITORY OF DATASETS
        </h1>
        <div className="grid grid-cols-1 sm:grid-cols-2 lg:grid-cols-5 mt-6 grid-y-6 gap-10 ">
          {themes.map((theme, index) => (
            <ThematicCards key={index} theme={theme} themeIndex={index} />
          ))}
        </div>
      </div>
    </div>
  );
}
