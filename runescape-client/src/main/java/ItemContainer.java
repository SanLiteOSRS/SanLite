import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cc")
@Implements("ItemContainer")
public class ItemContainer extends Node {
	@ObfuscatedName("vm")
	@ObfuscatedSignature(
		descriptor = "Llr;"
	)
	@Export("grandExchangeEvents")
	static GrandExchangeEvents grandExchangeEvents;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lqp;"
	)
	@Export("itemContainers")
	static NodeHashTable itemContainers;
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Laj;"
	)
	@Export("soundCache")
	static SoundCache soundCache;
	@ObfuscatedName("e")
	@Export("ids")
	int[] ids;
	@ObfuscatedName("v")
	@Export("quantities")
	int[] quantities;

	static {
		itemContainers = new NodeHashTable(32); // L: 7
	}

	ItemContainer() {
		this.ids = new int[]{-1}; // L: 8
		this.quantities = new int[]{0}; // L: 9
	} // L: 11

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(II)[B",
		garbageValue = "2077206502"
	)
	@Export("ByteArrayPool_getArray")
	public static synchronized byte[] ByteArrayPool_getArray(int var0) {
		return ByteArrayPool.ByteArrayPool_getArrayBool(var0, false); // L: 92
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/String;[IB)V",
		garbageValue = "1"
	)
	public static void method2237(String[] var0, int[] var1) {
		WorldMapID.method5277(var0, var1, 0, var0.length - 1); // L: 39
	} // L: 40

	@ObfuscatedName("ko")
	@ObfuscatedSignature(
		descriptor = "([Lkd;IIIZI)V",
		garbageValue = "-476895760"
	)
	@Export("resizeInterface")
	static void resizeInterface(Widget[] var0, int var1, int var2, int var3, boolean var4) {
		for (int var5 = 0; var5 < var0.length; ++var5) { // L: 10919
			Widget var6 = var0[var5]; // L: 10920
			if (var6 != null && var6.parentId == var1) { // L: 10921 10922
				Player.alignWidgetSize(var6, var2, var3, var4); // L: 10923
				class89.alignWidgetPosition(var6, var2, var3); // L: 10924
				if (var6.scrollX > var6.scrollWidth - var6.width) { // L: 10925
					var6.scrollX = var6.scrollWidth - var6.width;
				}

				if (var6.scrollX < 0) { // L: 10926
					var6.scrollX = 0;
				}

				if (var6.scrollY > var6.scrollHeight - var6.height) {
					var6.scrollY = var6.scrollHeight - var6.height; // L: 10927
				}

				if (var6.scrollY < 0) { // L: 10928
					var6.scrollY = 0;
				}

				if (var6.type == 0) { // L: 10929
					class169.revalidateWidgetScroll(var0, var6, var4);
				}
			}
		}

	} // L: 10931
}
