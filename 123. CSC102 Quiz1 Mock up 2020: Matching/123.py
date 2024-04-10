def main():
    input_str = input()
    s1, s2 = input_str.split()

    if s1 == s2:
        print("Perfect Match")
    elif s1.lower() == s2.lower() or s1.lower() in s2.lower() or s2.lower() in s1.lower():
        print("Partial Match")
    else:
        print("Not Match")

if __name__ == "__main__":
    main()
