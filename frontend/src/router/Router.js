import { BrowserRouter, Route, Routes } from "react-router-dom";

import { Main } from 'pages'
import { Playlist } from 'pages'

const index = () => {
  return (
    <BrowserRouter>
      <Routes>
        <Route path="/main" element={<Main />} />
        <Route path="/playlist" element={<Playlist />} />
      </Routes>
    </BrowserRouter>
  );
};

export default index;