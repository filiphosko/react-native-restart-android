/**
 * This exposes the native RestartAndroid module as a JS module. This has a
 * function 'restart' which takes no parameters.
 *
 */

import { NativeModules } from 'react-native';

module.exports = NativeModules.RestartAndroid;
