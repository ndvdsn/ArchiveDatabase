import React from "react";

const DigitalAsset = (props) => {

  if(!props.digitalAsset){
    return null;
  }

  const artists = props.digitalAsset.artists.map((artist, index)=>{
    return <ul key={index}>{artist.name}</ul>
  })


  const permissions = props.digitalAsset.permissions.map((permission, index)=>{
    return <ul key={index}>{permission.permissionGiven}</ul>
  })
  // eventually we'll want the permission detail here to be a link to the permissions object

  return(
    <div className = "single-document">
      <div className="details">
        <ul>
          <li>Type: {props.digitalAsset.type}</li>
          <li>File Name: {props.digitalAsset.fileName}</li>
          <li>Format: {props.digitalAsset.format}</li>
          <li>File Size: {props.digitalAsset.fileSize}</li>
          <li>Duration: {props.digitalAsset.duration}</li>
          <li>Document Notes: {props.digitalAsset.documentNotes}</li>
          <li>Hierarchy: {props.digitalAsset.hierarchy}</li>
          <li>Single Event: {props.digitalAsset.singleEvent}</li>
          <li>Artist: {artists}</li>
          <li>Permissions: {permissions}</li>
        </ul>
      </div>
    </div>
  )
}

export default DigitalAsset;
