import React from "react";

const PhysicalAsset = (props) => {

  if(!props.physicalAsset){
    return null;
  }

  // const id = props.physicalAsset.id

  const type = props.physicalAsset.type
  const format = props.physicalAsset.format
  const description = props.physicalAsset.description
  const itemNumber = props.physicalAsset.itemNumber
  const notes = props.physicalAsset.notes
  const location = props.physicalAsset.location


  const documents = props.physicalAsset.documents.map((digitalAsset, index)=>{
    return(
      <li key = {digitalAsset.id}>
      <div>
      {digitalAsset.id}
      <div>
      {digitalAsset.fileName}
      </div>
      </div>
      </li>
    )
  })

  const artists = props.physicalAsset.artists.map((artist, index)=>{
    return (
      <li key={artist.id}>
      <div>
      {artist.id}
      <div>
      <li>{artist.name}</li>
        <li></li>
      </div>
      </div>
      </li>
    )
  })

return(
  <div className = "single-physicalAsset">
  <div className="details">

    <ul>
    <li>Single Event Title: {props.physicalAsset.singleEvent.title}</li>
    <li>Type: {props.physicalAsset.type}</li>
    <li>Format: {props.physicalAsset.format}</li>
    <li>Description: {props.physicalAsset.description}</li>
    <li>Item Number: {props.physicalAsset.itemNumber}</li>
    <li>location:{props.physicalAsset.location} </li>
    <li>Notes:{props.physicalAsset.notes} </li>
    <li>Documents associated with this item:</li>
    {documents}
    <li>Artists associated with this item:</li>
    {artists}
    </ul>
  </div>
  </div>
)


}

export default PhysicalAsset;
