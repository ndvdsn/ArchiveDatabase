import React from "react";
import PhysicalAsset from "./PhysicalAsset";

const PhysicalAssetList = (props) => {

  console.log(props.physicalAssets);

  if (props.physicalAssets == null || props.physicalAssets.length ===0){
    return <p>Loading...</p>
  }

  const physicalAssets = props.physicalAssets.map((physicalAsset)=>{
    return(
      <li key = {physicalAsset.id} className = "physicalAsset-item">
      <PhysicalAsset physicalAsset = {physicalAsset}/>
      </li>
    )
  })
  console.log(physicalAssets);

  return (
    <div>
    <ul>
    {physicalAssets}
    </ul>
    </div>
  )
};

export default PhysicalAssetList;
