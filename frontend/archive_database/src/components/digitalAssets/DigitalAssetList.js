import React from "react";
import DigitalAsset from "./DigitalAsset";

const DigitalAssetList = (props) => {

  if (props.digitalAssets == null || props.digitalAssets.length ===0){
    return <p> loading...</p>
  }

  const digitalAssets = props.digitalAssets.map((digitalAsset)=>{
    return(
      <li key = {digitalAsset.id} className = "digitalAsset-item">
      <DigitalAsset digitalAsset = {digitalAsset}/>
      </li>
    )
  })

  return (
    <div>
    <ul>
    {digitalAssets}
    </ul>
    </div>
  )
};

export default DigitalAssetList
