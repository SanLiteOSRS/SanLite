import java.util.HashMap;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cn")
@Implements("Messages")
public class Messages {
   @ObfuscatedName("s")
   @Export("Messages_channels")
   static final Map Messages_channels = new HashMap();
   @ObfuscatedName("j")
   @ObfuscatedSignature(
      signature = "Lln;"
   )
   @Export("Messages_hashTable")
   static final IterableNodeHashTable Messages_hashTable = new IterableNodeHashTable(1024);
   @ObfuscatedName("i")
   @ObfuscatedSignature(
      signature = "Ljm;"
   )
   @Export("Messages_queue")
   static final IterableDualNodeQueue Messages_queue = new IterableDualNodeQueue();
   @ObfuscatedName("k")
   @ObfuscatedGetter(
      intValue = -1379002883
   )
   @Export("Messages_count")
   static int Messages_count = 0;
   @ObfuscatedName("gw")
   @Export("regionMapArchives")
   static byte[][] regionMapArchives;
   @ObfuscatedName("gz")
   @ObfuscatedSignature(
      signature = "[Llq;"
   )
   @Export("modIconSprites")
   static IndexedSprite[] modIconSprites;
}
