import java.util.Arrays;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gl")
public class class205 implements class29 {
	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "Lrg;"
	)
	@Export("worldSelectRightSprite")
	static IndexedSprite worldSelectRightSprite;
	@ObfuscatedName("f")
	char[] field2326;
	@ObfuscatedName("w")
	int[] field2327;
	@ObfuscatedName("v")
	public int[] field2328;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 667075159
	)
	public int field2335;
	@ObfuscatedName("z")
	int[] field2337;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = -396683223
	)
	int field2329;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = -181633771
	)
	int field2332;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 1658572189
	)
	int field2331;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -1598015947
	)
	int field2334;
	@ObfuscatedName("k")
	boolean[] field2338;
	@ObfuscatedName("c")
	boolean[] field2336;
	@ObfuscatedName("r")
	boolean[] field2330;
	@ObfuscatedName("b")
	public char field2333;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -1124742409
	)
	public int field2339;

	public class205() {
		this.field2326 = new char[128]; // L: 8
		this.field2327 = new int[128]; // L: 9
		this.field2328 = new int[128]; // L: 10
		this.field2335 = 0; // L: 11
		this.field2337 = new int[128]; // L: 12
		this.field2329 = 0; // L: 13
		this.field2332 = 0; // L: 14
		this.field2331 = 0; // L: 15
		this.field2334 = 0; // L: 16
		this.field2338 = new boolean[112]; // L: 17
		this.field2336 = new boolean[112]; // L: 18
		this.field2330 = new boolean[112]; // L: 19
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "110"
	)
	public boolean vmethod4135(int var1) {
		this.method4138(var1); // L: 24
		this.field2338[var1] = true; // L: 25
		this.field2336[var1] = true; // L: 26
		this.field2330[var1] = false; // L: 27
		this.field2328[++this.field2335 - 1] = var1; // L: 28
		return true; // L: 29
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "11"
	)
	public boolean vmethod4136(int var1) {
		this.field2338[var1] = false; // L: 33
		this.field2336[var1] = false; // L: 34
		this.field2330[var1] = true; // L: 35
		this.field2337[++this.field2329 - 1] = var1; // L: 36
		return true; // L: 37
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "783044550"
	)
	public boolean vmethod4179(char var1) {
		int var2 = this.field2331 + 1 & 127; // L: 41
		if (var2 != this.field2332) { // L: 42
			this.field2327[this.field2331] = -1; // L: 43
			this.field2326[this.field2331] = var1; // L: 44
			this.field2331 = var2; // L: 45
		}

		return false; // L: 47
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(ZI)Z",
		garbageValue = "653857297"
	)
	public boolean vmethod4139(boolean var1) {
		return false; // L: 60
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1103025753"
	)
	void method4138(int var1) {
		int var2 = this.field2331 + 1 & 127; // L: 51
		if (var2 != this.field2332) { // L: 52
			this.field2327[this.field2331] = var1; // L: 53
			this.field2326[this.field2331] = 0; // L: 54
			this.field2331 = var2; // L: 55
		}

	} // L: 57

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "8"
	)
	public void method4140() {
		this.field2332 = this.field2334; // L: 64
		this.field2334 = this.field2331; // L: 65
		this.field2335 = 0; // L: 66
		this.field2329 = 0; // L: 67
		Arrays.fill(this.field2336, false); // L: 68
		Arrays.fill(this.field2330, false); // L: 69
	} // L: 70

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "51"
	)
	public final boolean method4141() {
		if (this.field2334 == this.field2332) { // L: 73
			return false;
		} else {
			this.field2339 = this.field2327[this.field2332]; // L: 74
			this.field2333 = this.field2326[this.field2332]; // L: 75
			this.field2332 = this.field2332 + 1 & 127; // L: 76
			return true; // L: 77
		}
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "0"
	)
	public boolean method4142(int var1) {
		return var1 >= 0 && var1 < 112 ? this.field2336[var1] : false; // L: 81 82
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "44"
	)
	public boolean method4143(int var1) {
		return var1 >= 0 && var1 < 112 ? this.field2338[var1] : false; // L: 86 87
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "32514287"
	)
	public boolean method4157(int var1) {
		return var1 >= 0 && var1 < 112 ? this.field2330[var1] : false; // L: 91 92
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(B)[I",
		garbageValue = "-100"
	)
	public int[] method4177() {
		int[] var1 = new int[this.field2335]; // L: 96

		for (int var2 = 0; var2 < this.field2335; ++var2) { // L: 97
			var1[var2] = this.field2328[var2]; // L: 98
		}

		return var1; // L: 100
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "848909243"
	)
	public int[] method4145() {
		int[] var1 = new int[this.field2329]; // L: 104

		for (int var2 = 0; var2 < this.field2329; ++var2) { // L: 105
			var1[var2] = this.field2337[var2]; // L: 106
		}

		return var1; // L: 108
	}

	@ObfuscatedName("je")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "-90"
	)
	@Export("resumePauseWidget")
	static void resumePauseWidget(int var0, int var1) {
		PacketBufferNode var2 = Renderable.getPacketBufferNode(ClientPacket.field3155, Client.packetWriter.isaacCipher); // L: 10298
		var2.packetBuffer.writeShort(var1); // L: 10299
		var2.packetBuffer.writeInt(var0); // L: 10300
		Client.packetWriter.addNode(var2); // L: 10301
	} // L: 10302
}
