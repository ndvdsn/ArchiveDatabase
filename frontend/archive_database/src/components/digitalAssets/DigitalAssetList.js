import React from "react";
import DigitalAsset from "./DigitalAsset";

const DigitalAssetList = (props) => {


  console.log(props.digitalAssets);

  if (props.digitalAssets == null || props.digitalAssets.length ===0){
    return <p> loading...</p>
  }


  const dAssets = props.digitalAssets.map((digitalAsset)=>{
    return(
      <li key = {digitalAsset.id} className = "digitalAsset-item">
      <DigitalAsset digitalAsset = {digitalAsset}/>
      </li>
    )
  })

  console.log(dAssets);

  return (
    <div>
    <ul>
    {dAssets}
    </ul>
    </div>
  )
};

export default DigitalAssetList;
