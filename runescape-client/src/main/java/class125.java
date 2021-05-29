import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dq")
public enum class125 implements Enumerated {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Ldq;"
	)
	field1470(2, 0),
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Ldq;"
	)
	field1469(1, 1),
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Ldq;"
	)
	field1468(0, 2),
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Ldq;"
	)
	field1471(3, 3);

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Lnd;"
	)
	@Export("NetCache_reference")
	public static Buffer NetCache_reference;
	@ObfuscatedName("ec")
	@ObfuscatedSignature(
		descriptor = "Ljp;"
	)
	@Export("archive14")
	static Archive archive14;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 850248893
	)
	public final int field1472;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -1949743275
	)
	@Export("id")
	final int id;

	class125(int var3, int var4) {
		this.field1472 = var3;
		this.id = var4;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-907662946"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "-60"
	)
	static int method2502(int var0, int var1) {
		long var2 = (long)((var0 << 16) + var1);
		return BuddyRankComparator.NetCache_currentResponse != null && var2 == BuddyRankComparator.NetCache_currentResponse.key ? SoundSystem.NetCache_responseArchiveBuffer.offset * 99 / (SoundSystem.NetCache_responseArchiveBuffer.array.length - BuddyRankComparator.NetCache_currentResponse.padding) + 1 : 0;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2118107095"
	)
	static final int method2504() {
		return ViewportMouse.ViewportMouse_x;
	}

	@ObfuscatedName("ja")
	@ObfuscatedSignature(
		descriptor = "(Lio;Leq;IIZI)V",
		garbageValue = "1630446885"
	)
	@Export("addWidgetItemMenuItem")
	static final void addWidgetItemMenuItem(Widget var0, ItemComposition var1, int var2, int var3, boolean var4) {
		String[] var5 = var1.inventoryActions;
		byte var6 = -1;
		String var7 = null;
		if (var5 != null && var5[var3] != null) {
			if (var3 == 0) {
				var6 = 33;
			} else if (var3 == 1) {
				var6 = 34;
			} else if (var3 == 2) {
				var6 = 35;
			} else if (var3 == 3) {
				var6 = 36;
			} else {
				var6 = 37;
			}

			var7 = var5[var3];
		} else if (var3 == 4) {
			var6 = 37;
			var7 = "Drop";
		}

		if (var6 != -1 && var7 != null) {
			BoundaryObject.insertMenuItem(var7, class44.colorStartTag(16748608) + var1.name, var6, var1.id, var2, var0.id, var4);
		}

	}
}
