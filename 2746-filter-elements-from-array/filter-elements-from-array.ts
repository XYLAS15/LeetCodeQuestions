const filter = function(arr: number[], fn: (n: number, i: number) => boolean): number[] {
  return arr.reduce((result: number[], value: number, index: number) => {
    if (fn(value, index)) {
      result.push(value);
    }
    return result;
  }, []);
};