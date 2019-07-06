import React from "react";

const DigitalAsset = (props) => {

  if(!props.digitalAsset){
    return null;
  }

  console.log(props.digitalAsset)

  const artist = props.digitalAsset.artists.map((artist, index)=>{
    return <ul key={index}>{artist.name}</ul>
  })


  const permission = props.digitalAsset.permissions.map((permission, index)=>{
    return <ul key={index}>{permission.permissionGiven}</ul>
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
          <li>Permissions: {artist} {permission} </li>
        </ul>
      </div>
    </div>
  )
  // currently getting an array of permissions instead of specific ones.
}

export default DigitalAsset;
