import { Item } from './item';

export interface Bill{
    id: number,
    buyerId: number,
    type: string,
    date: string,
    remarks: string
    items: Item[],
    amount: number
}