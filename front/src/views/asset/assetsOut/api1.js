import { getRequest, postRequest } from '@/libs/axios';

export const getWarehouseOutList = (params) => {
    return getRequest('/warehouseOut/getByPage', params)
}
export const addWarehouseOut = (params) => {
    return postRequest('/warehouseOut/insert', params)
}
export const editWarehouseOut = (params) => {
    return postRequest('/warehouseOut/update', params)
}
export const deleteWarehouseOut = (params) => {
    return postRequest('/warehouseOut/delByIds', params)
}
export const getAssetListData1 = (params) => {
    return getRequest('/assetsType/getByPage?natureType=1', params)
}