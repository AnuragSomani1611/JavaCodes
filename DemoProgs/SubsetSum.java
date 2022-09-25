//def subset_sum(numbers, target, partial=[]):
//        s = sum(partial)
//        for i in range(len(numbers)):
//        n = numbers[i]
//        remaining = numbers[i+1:]
//        subset_sum(remaining, target, partial + [n])
//        if s >= target:
//        return
//
//        if s == target:
//        print(*partial)
//        return
//
//
//        if _name_ == "_main_":
//        subset_sum([1,3,4,5,9,10],16)