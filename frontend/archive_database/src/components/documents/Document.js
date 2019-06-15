import React from "react";

const Document = (props) => {

  if(!props.document_){
    return null;
  }

  const artists = props.document.artists.map((artist, index)=>{
    return <ul key={index}>{artist.name}</ul>
  })

  const permissions = props.document.permissions.map((permission, index)=>{
    return <ul key={index}>{permission.permissionGiven}</ul>
  })
  // eventually we'll want the permission detail here to be a link to the permissions object

  return(
    <div className = "single-document">
      <ul>
      <li>Type: {props.document.type}</li>
      <li>File Name: {props.document.fileName}</li>
      <li>Format: {props.document.format}</li>
      <li>File Size: {props.document.fileSize}</li>
      <li>Duration: {props.document.duration}</li>
      <li>Document Notes: {props.document.documentNotes}</li>
      <li>Hierarchy: {props.document.hierarchy}</li>
      <li>Single Event: {props.document.singleEvent}</li>
      <li>Artist: {artists}</li>
      <li>Permissions: {permissions}</li>
      </ul>
    </div>
  )
}

export default Document;
