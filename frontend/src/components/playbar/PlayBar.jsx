import styled from 'styled-components'

const PlayBar = () => {
  if (window.location.pathname === '/mix') {
    return null
  }

  return (
    <Body>
      <h2>PlayBar</h2>
    </Body>
  );
};


const Body = styled.div`
  width: ${window.innerWidth - 300}px;
  border: 1px solid blue;
  position: fixed;
  right: 0;
  bottom: 0;
  height: 150px;
  filter: drop-shadow(0px -25px 100px rgba(16, 16, 16, 0.51));
`

export default PlayBar;