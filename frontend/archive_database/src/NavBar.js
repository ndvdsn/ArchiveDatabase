import React from "react";
import {Link} from "react-router-dom";

const NavBar = (props) => {
  return (
    <header>
    <ul className="navbar-sections">

      <li className="navLink">
      <Link to="/artists">Artists</Link>
      </li>

      <li className="navLink">
      <Link to="/multiEvents">Multi Events</Link>
      </li>

      <li className="navLink">
      <Link to="/documents">Documents</Link>
      </li>

      <li className="navLink">
      <Link to="/permissions">Permissions</Link>
      </li>
      
      <li className="navLink">
      <Link to="/singleEvents">Single Events</Link>
      </li>

      <li className="navLink">
      <Link to="/groups">Groups</Link>
      </li>

    </ul>
    </header>
  )
}
export default NavBar;
