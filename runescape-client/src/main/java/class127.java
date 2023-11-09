import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eb")
public class class127 {
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -1780664733
	)
	public final int field1507;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Leb;"
	)
	public class127 field1502;
	@ObfuscatedName("ac")
	float[][] field1503;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "[Lrp;"
	)
	final class450[] field1504;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "[Lrp;"
	)
	class450[] field1505;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "[Lrp;"
	)
	class450[] field1508;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lrp;"
	)
	class450 field1509;
	@ObfuscatedName("an")
	boolean field1512;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lrp;"
	)
	class450 field1501;
	@ObfuscatedName("az")
	boolean field1506;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lrp;"
	)
	class450 field1511;
	@ObfuscatedName("ao")
	float[][] field1513;
	@ObfuscatedName("as")
	float[][] field1510;
	@ObfuscatedName("am")
	float[][] field1514;

	@ObfuscatedSignature(
		descriptor = "(ILtl;Z)V"
	)
	public class127(int var1, Buffer var2, boolean var3) {
		this.field1509 = new class450(); // L: 13
		this.field1512 = true; // L: 14
		this.field1501 = new class450(); // L: 15
		this.field1506 = true; // L: 16
		this.field1511 = new class450(); // L: 17
		this.field1507 = var2.readShort(); // L: 23
		this.field1504 = new class450[var1]; // L: 24
		this.field1505 = new class450[this.field1504.length]; // L: 25
		this.field1508 = new class450[this.field1504.length]; // L: 26
		this.field1503 = new float[this.field1504.length][3]; // L: 27

		for (int var4 = 0; var4 < this.field1504.length; ++var4) { // L: 28
			this.field1504[var4] = new class450(var2, var3); // L: 29
			this.field1503[var4][0] = var2.method9065(); // L: 30
			this.field1503[var4][1] = var2.method9065(); // L: 31
			this.field1503[var4][2] = var2.method9065(); // L: 32
		}

		this.method3008(); // L: 34
	} // L: 35

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1299086445"
	)
	void method3008() {
		this.field1513 = new float[this.field1504.length][3]; // L: 38
		this.field1510 = new float[this.field1504.length][3]; // L: 39
		this.field1514 = new float[this.field1504.length][3]; // L: 40
		class450 var1;
		synchronized(class450.field4733) { // L: 43
			if (class383.field4405 == 0) { // L: 44
				var1 = new class450();
			} else {
				class450.field4733[--class383.field4405].method8202(); // L: 46
				var1 = class450.field4733[class383.field4405]; // L: 47
			}
		}

		class450 var2 = var1; // L: 51

		for (int var5 = 0; var5 < this.field1504.length; ++var5) { // L: 52
			class450 var4 = this.method3009(var5); // L: 53
			var2.method8209(var4); // L: 54
			var2.method8258(); // L: 55
			this.field1513[var5] = var2.method8206(); // L: 56
			this.field1510[var5][0] = var4.field4734[12]; // L: 57
			this.field1510[var5][1] = var4.field4734[13]; // L: 58
			this.field1510[var5][2] = var4.field4734[14]; // L: 59
			this.field1514[var5] = var4.method8219(); // L: 60
		}

		var2.method8246();
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(II)Lrp;",
		garbageValue = "-2131870596"
	)
	class450 method3009(int var1) {
		return this.field1504[var1]; // L: 66
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IB)Lrp;",
		garbageValue = "16"
	)
	class450 method3010(int var1) {
		if (this.field1505[var1] == null) { // L: 70
			this.field1505[var1] = new class450(this.method3009(var1)); // L: 71
			if (this.field1502 != null) { // L: 72
				this.field1505[var1].method8257(this.field1502.method3010(var1)); // L: 73
			} else {
				this.field1505[var1].method8257(class450.field4735); // L: 76
			}
		}

		return this.field1505[var1]; // L: 79
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)Lrp;",
		garbageValue = "541516742"
	)
	class450 method3011(int var1) {
		if (this.field1508[var1] == null) { // L: 83
			this.field1508[var1] = new class450(this.method3010(var1)); // L: 84
			this.field1508[var1].method8258(); // L: 85
		}

		return this.field1508[var1]; // L: 87
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lrp;B)V",
		garbageValue = "0"
	)
	void method3012(class450 var1) {
		this.field1509.method8209(var1); // L: 91
		this.field1512 = true; // L: 92
		this.field1506 = true; // L: 93
	} // L: 94

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)Lrp;",
		garbageValue = "-1522807612"
	)
	class450 method3013() {
		return this.field1509; // L: 97
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)Lrp;",
		garbageValue = "72554601"
	)
	class450 method3014() {
		if (this.field1512) { // L: 101
			this.field1501.method8209(this.method3013()); // L: 102
			if (this.field1502 != null) { // L: 103
				this.field1501.method8257(this.field1502.method3014()); // L: 104
			}

			this.field1512 = false; // L: 106
		}

		return this.field1501; // L: 108
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II)Lrp;",
		garbageValue = "604804560"
	)
	public class450 method3027(int var1) {
		if (this.field1506) { // L: 112
			this.field1511.method8209(this.method3011(var1)); // L: 113
			this.field1511.method8257(this.method3014()); // L: 114
			this.field1506 = false; // L: 115
		}

		return this.field1511; // L: 117
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IB)[F",
		garbageValue = "23"
	)
	float[] method3015(int var1) {
		return this.field1513[var1]; // L: 121
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(II)[F",
		garbageValue = "-1680342498"
	)
	float[] method3016(int var1) {
		return this.field1510[var1]; // L: 125
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(II)[F",
		garbageValue = "711299153"
	)
	float[] method3017(int var1) {
		return this.field1514[var1]; // L: 129
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IB)Lhg;",
		garbageValue = "-124"
	)
	@Export("WorldMapElement_get")
	public static WorldMapElement WorldMapElement_get(int var0) {
		return var0 >= 0 && var0 < WorldMapElement.WorldMapElement_cached.length && WorldMapElement.WorldMapElement_cached[var0] != null ? WorldMapElement.WorldMapElement_cached[var0] : new WorldMapElement(var0); // L: 62 63
	}

	@ObfuscatedName("mt")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1587497709"
	)
	static final void method3046() {
		Client.field702 = Client.cycleCntr; // L: 12586
		class295.FriendsChatManager_inFriendsChat = true; // L: 12587
	} // L: 12588
}
