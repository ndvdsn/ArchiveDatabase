import React from "react";

const Permission = (props) => {

  if(!props.permission){
    return null;
  }




  return(
    <div className = "single-permission">
      <div className="details">
      <ul>
        <div>
        <li>Artist name: {props.permission.artist.name}</li>
        </div>
        <div>
        <li>Downloadable? {props.permission.downloadable}</li>
        </div>
        <div>
        <li>Streamable? {props.permission.streamable}</li>
        </div>
        <div>
        <li>So can we use it? {props.permission.permissionGiven}</li>
        </div>
        <div>
        <li>Rights: {props.permission.rights}</li>
        </div>
        <div>
        <li>Notes: {props.permission.permissionNotes}</li>
        </div>
        <div>
        <li>Date contacted: {props.permission.dateContacted}</li>
        </div>
      </ul>
      </div>
    </div>
  )
}
export default Permission;
