
    //printing whole tree......................................................................................

    public void printTree(node root)
    {
        if(root != null)                      //in-order traversal..........
        {
            printTree(root.getLeft());                    //recursion.................
            System.out.print("..."+root.bookName+"...");
            printTree(root.getRight());                   //recursion.................
        }

    }
