import { combineReducers, createStore} from "redux";
import userReducer from "./reducers/userReducer";

const allReducers = combineReducers({
  user: userReducer,
});

const store = createStore(allReducers);

export default store;
