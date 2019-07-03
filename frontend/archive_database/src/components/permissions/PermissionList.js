import React from "react";
import Permission from "./Permission"

const PermissionList = (props) => {

  if (props.permissions == null || props.permissions.length ===0){
    return<p> Loading...</p>
  }

  const permissions = props.permissions.map((permission)=>{
    return(
      <li key = {permission.id} className = "permission-item">
      <Permission permission = {permission}/>
      </li>
    )
  })

  return (
    <div>
    <ul>
    {permissions}
    </ul>
    </div>
  )
};

export default PermissionList;
