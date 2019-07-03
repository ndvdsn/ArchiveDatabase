import React from "react";

const Permission = (props) => {

  if(!props.permission){
    return null;
  }




  return(
    <div className = "single-permission">
      <div className="details">
      <ul>
      <li>{props.permission._embedded.artist.name}</li>
      <li>{props.permission.downloadable}</li>
      <li>{props.permission.streamable}</li>
      <li>{props.permission.permissionGiven}</li>
      <li>{props.permission.rights}</li>
      <li>{props.permission.permissionNotes}</li>
      <li>{props.permission.dateContacted}</li>
      </ul>
      </div>
    </div>
  )
}
export default Permission;
