import java.util.Collection;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jp")
@Implements("IterableNodeDeque")
public class IterableNodeDeque implements Iterable, Collection {
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      signature = "Lfb;"
   )
   @Export("sentinel")
   Node sentinel = new Node();
   @ObfuscatedName("j")
   @ObfuscatedSignature(
      signature = "Lfb;"
   )
   Node field3511;

   public IterableNodeDeque() {
      this.sentinel.previous = this.sentinel;
      this.sentinel.next = this.sentinel;
   }

   @ObfuscatedName("s")
   @Export("rsClear")
   public void rsClear() {
      while(this.sentinel.previous != this.sentinel) {
         this.sentinel.previous.remove();
      }

   }

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      signature = "(Lfb;)V"
   )
   @Export("addFirst")
   public void addFirst(Node var1) {
      if (var1.next != null) {
         var1.remove();
      }

      var1.next = this.sentinel.next;
      var1.previous = this.sentinel;
      var1.next.previous = var1;
      var1.previous.next = var1;
   }

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      signature = "(Lfb;)V"
   )
   @Export("addLast")
   public void addLast(Node var1) {
      if (var1.next != null) {
         var1.remove();
      }

      var1.next = this.sentinel;
      var1.previous = this.sentinel.previous;
      var1.next.previous = var1;
      var1.previous.next = var1;
   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "()Lfb;"
   )
   @Export("last")
   public Node last() {
      return this.method4726((Node)null);
   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      signature = "(Lfb;)Lfb;"
   )
   Node method4726(Node var1) {
      Node var2;
      if (var1 == null) {
         var2 = this.sentinel.previous;
      } else {
         var2 = var1;
      }

      if (var2 == this.sentinel) {
         this.field3511 = null;
         return null;
      } else {
         this.field3511 = var2.previous;
         return var2;
      }
   }

   @ObfuscatedName("t")
   @ObfuscatedSignature(
      signature = "()Lfb;"
   )
   @Export("previous")
   public Node previous() {
      Node var1 = this.field3511;
      if (var1 == this.sentinel) {
         this.field3511 = null;
         return null;
      } else {
         this.field3511 = var1.previous;
         return var1;
      }
   }

   @ObfuscatedName("q")
   int method4728() {
      int var1 = 0;

      for(Node var2 = this.sentinel.previous; var2 != this.sentinel; var2 = var2.previous) {
         ++var1;
      }

      return var1;
   }

   @ObfuscatedName("x")
   @Export("rsIsEmpty")
   public boolean rsIsEmpty() {
      return this.sentinel.previous == this.sentinel;
   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      signature = "()[Lfb;"
   )
   Node[] method4730() {
      Node[] var1 = new Node[this.method4728()];
      int var2 = 0;

      for(Node var3 = this.sentinel.previous; var3 != this.sentinel; var3 = var3.previous) {
         var1[var2++] = var3;
      }

      return var1;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(Lfb;)Z"
   )
   boolean method4735(Node var1) {
      this.addFirst(var1);
      return true;
   }

   public boolean isEmpty() {
      return this.rsIsEmpty();
   }

   public int size() {
      return this.method4728();
   }

   public void clear() {
      this.rsClear();
   }

   public boolean remove(Object var1) {
      throw new RuntimeException();
   }

   public boolean containsAll(Collection var1) {
      throw new RuntimeException();
   }

   public boolean removeAll(Collection var1) {
      throw new RuntimeException();
   }

   public boolean retainAll(Collection var1) {
      throw new RuntimeException();
   }

   public Iterator iterator() {
      return new IterableNodeDequeDescendingIterator(this);
   }

   public boolean add(Object var1) {
      return this.method4735((Node)var1);
   }

   public boolean contains(Object var1) {
      throw new RuntimeException();
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }

   public boolean addAll(Collection var1) {
      throw new RuntimeException();
   }

   public int hashCode() {
      return super.hashCode();
   }

   public Object[] toArray() {
      return this.method4730();
   }

   public Object[] toArray(Object[] var1) {
      int var2 = 0;

      for(Node var3 = this.sentinel.previous; var3 != this.sentinel; var3 = var3.previous) {
         var1[var2++] = var3;
      }

      return var1;
   }

   @ObfuscatedName("k")
   @ObfuscatedSignature(
      signature = "(Lfb;Lfb;)V"
   )
   @Export("IterableNodeDeque_addBefore")
   public static void IterableNodeDeque_addBefore(Node var0, Node var1) {
      if (var0.next != null) {
         var0.remove();
      }

      var0.next = var1;
      var0.previous = var1.previous;
      var0.next.previous = var0;
      var0.previous.next = var0;
   }
}
