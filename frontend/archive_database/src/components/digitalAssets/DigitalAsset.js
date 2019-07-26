import React from "react";

const DigitalAsset = (props) => {

  if(!props.digitalAsset){
    return null;
  }

  const id = props.digitalAsset.id

  const artists = props.digitalAsset.artists.map((artist, index)=>{
    return(
    <li key={artist.id}>
    <div>
    {artist.id}
    <div>
    {artist.name}
    </div>
    </div>
    </li>
  )
  })


  const permissions = props.digitalAsset.permissions.map((permission, index)=>{
    return(
    <li key={permission.id}>
    <div>
    {permission.id}
    <div>
    <li>{permission.permissionGiven}</li>
    <li>{permission.rights}</li>
    <li></li>
    </div>
    </div>
    </li>
  )
  })
  // eventually we'll want the permission detail here to be a link to the permissions object

  return(
    <div className = "single-document">
      <div className="details">
        <ul>
          <li>Single Event: {props.digitalAsset.singleEvent.title}</li>
          <li>File Name: {props.digitalAsset.fileName}</li>
          <li>Hierarchy: {props.digitalAsset.hierarchy}</li>
          <li>Type: {props.digitalAsset.type}</li>
          <li>Format: {props.digitalAsset.format}</li>
          <li>File Size: {props.digitalAsset.fileSize}</li>
          <li>Duration: {props.digitalAsset.duration}</li>
          <li>Document Notes: {props.digitalAsset.documentNotes}</li>
          <li>Artists:</li>
          {artists}
          <li>Permissions:</li>
          {permissions}
        </ul>
      </div>
    </div>
  )
  // currently getting an array of permissions instead of specific ones.
  // *** consider using tables / table for the permissions properties above ***
}

export default DigitalAsset;
