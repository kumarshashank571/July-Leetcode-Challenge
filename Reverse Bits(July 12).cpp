uint32_t reverseBits(uint32_t n) {
      int ans = 0;
  int count = 0;
  while (count < 32) {
    ans <<= 1;
    ans |= (n % 2);
    n >>= 1;
    count++;
  }
  return ans;  
    }
