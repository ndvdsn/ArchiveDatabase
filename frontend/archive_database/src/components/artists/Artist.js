import React from "react";
import moment from "moment";

const Artist = (props) => {

  if(!props.artist){
    return null;
  }

  const id = props.artist.id
  const artistName = props.artist.name;
  const artistCountry = props.artist.country;

  const dateBasic = props.artist.singleEvents.map((singleEvent)=>{
    return singleEvent.date
  })

  // const time = props.artist.singleEvents.map((singleEvent)=>{
  //   return singleEvent.time
  // })
  const slicedDate = dateBasic.slice(0,10)

  const formattedDate = moment(slicedDate).format("dddd Do MMM YYYY");
  const time = moment(slicedDate).format('hh:mm z','Europe/London');

  const artist_singleEvents = props.artist.singleEvents.map((singleEvent, index) => {
      return(
        <li key= {singleEvent.id} >
        <div>
        {singleEvent.id}

        <div>
        {' '}{singleEvent.title} at:{' '}{singleEvent.venue} in:{' '}{singleEvent.location} on:{' '} {singleEvent.date} {' '}{singleEvent.time}
        </div>
        </div>
        </li>
      )
    })

  const artist_groups = props.artist.groups.map((group, index) => {
    return(
      <li key={group.id} >
      <div>
      {group.id}

      <div>
      {' '}{group.name}
      </div>
      </div>
      </li>
    )
  })

  return(
    <div className = "single-artist">
      <div className = "details">
      <ul>
        <div>
        Name:   {' '}<a href={'/artists/'+id}>  {' '}{artistName}</a>
        </div>
        <div>
        Country:   {' '}{artistCountry}
        </div>
        <div>
        </div>
        <div className="artist-singleEvent-container" >
        <h4>Participated in events:</h4>
          <div>
          <ul>{artist_singleEvents}</ul>
          </div>
        </div>
        <div className="artist-singleEvent-container" >
        <h4>Member of groups:</h4>
          <div>
          <ul>{artist_groups}</ul>
          </div>
        </div>
      </ul>
      </div>
    </div>
  )
}

export default Artist;
