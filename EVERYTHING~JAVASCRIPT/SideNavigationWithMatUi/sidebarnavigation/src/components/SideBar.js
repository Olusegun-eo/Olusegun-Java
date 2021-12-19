import React from 'react'
import "../App.css";
import {SideBarData} from "./SideBarData"


function SideBar() {
    return (
        <div className="sidebar">
            <ul className="sidebar-list">
                {SideBarData.map( (value, key)=>{
                    return(
                        <li 
                        key={key} 
                        id = {window.location.pathname === value.link ? "active" : " "}
                        className="row"
                        onClick= {() =>{window.location.pathname=value.link}}
                        >
                        <div id="icon">{value.icons}</div>
                        <div id="title">{value.title}</div>
                        </li>
                    )
                })}
            </ul>
        </div>
    )
}

export default SideBar
