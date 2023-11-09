import java.util.Arrays;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bv")
public class class27 {
	@ObfuscatedName("av")
	int[] field144;
	@ObfuscatedName("aq")
	int[] field143;

	public class27() {
		this.field144 = new int[112]; // L: 12
		this.field143 = new int[192]; // L: 13
		Arrays.fill(this.field144, 3); // L: 16
		Arrays.fill(this.field143, 3); // L: 17
	} // L: 18

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1963115442"
	)
	public void method384(int var1, int var2) {
		if (this.method392(var1) && this.method397(var2)) { // L: 21
			this.field144[var1] = var2; // L: 22
		}

	} // L: 24

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(CIB)V",
		garbageValue = "7"
	)
	public void method385(char var1, int var2) {
		if (this.method418(var1) && this.method397(var2)) { // L: 27
			this.field143[var1] = var2; // L: 28
		}

	} // L: 30

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "314358708"
	)
	public int method386(int var1) {
		return this.method392(var1) ? this.field144[var1] : 0; // L: 33 34 36
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(CI)I",
		garbageValue = "1656635959"
	)
	public int method387(char var1) {
		return this.method418(var1) ? this.field143[var1] : 0; // L: 40 41 43
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1116456996"
	)
	public boolean method388(int var1) {
		return this.method392(var1) && (this.field144[var1] == 1 || this.field144[var1] == 3); // L: 47
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "219089429"
	)
	public boolean method389(char var1) {
		return this.method418(var1) && (this.field143[var1] == 1 || this.field143[var1] == 3); // L: 51
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-713108390"
	)
	public boolean method390(int var1) {
		return this.method392(var1) && (this.field144[var1] == 2 || this.field144[var1] == 3); // L: 55
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "-1181390427"
	)
	public boolean method391(char var1) {
		return this.method418(var1) && (this.field143[var1] == 2 || this.field143[var1] == 3); // L: 59
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "3"
	)
	boolean method392(int var1) {
		if (var1 >= 0 && var1 < 112) { // L: 63
			return true; // L: 67
		} else {
			System.out.println("Invalid keycode: " + var1); // L: 64
			return false; // L: 65
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(CB)Z",
		garbageValue = "35"
	)
	boolean method418(char var1) {
		if (var1 >= 0 && var1 < 192) { // L: 71
			return true; // L: 75
		} else {
			System.out.println("Invalid keychar: " + var1); // L: 72
			return false; // L: 73
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "-97"
	)
	boolean method397(int var1) {
		if (var1 >= 0 && var1 < 4) { // L: 79
			return true; // L: 83
		} else {
			System.out.println("Invalid mode: " + var1); // L: 80
			return false; // L: 81
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1099055181"
	)
	public static void method419() {
		KitDefinition.KitDefinition_cached.clear(); // L: 132
	} // L: 133

	@ObfuscatedName("jr")
	@ObfuscatedSignature(
		descriptor = "(Lda;I)V",
		garbageValue = "115499673"
	)
	static final void method383(PendingSpawn var0) {
		long var1 = 0L; // L: 7907
		int var3 = -1; // L: 7908
		int var4 = 0; // L: 7909
		int var5 = 0; // L: 7910
		if (var0.type == 0) { // L: 7911
			var1 = class1.scene.getWallObjectTag(var0.plane, var0.x, var0.y);
		}

		if (var0.type == 1) { // L: 7912
			var1 = class1.scene.getDecorativeObjectTag(var0.plane, var0.x, var0.y);
		}

		if (var0.type == 2) { // L: 7913
			var1 = class1.scene.getGameObjectTag(var0.plane, var0.x, var0.y);
		}

		if (var0.type == 3) { // L: 7914
			var1 = class1.scene.getGroundObjectTag(var0.plane, var0.x, var0.y);
		}

		if (0L != var1) { // L: 7915
			int var6 = class1.scene.getObjectFlags(var0.plane, var0.x, var0.y, var1); // L: 7916
			var3 = class279.Entity_unpackID(var1); // L: 7917
			var4 = var6 & 31; // L: 7918
			var5 = var6 >> 6 & 3; // L: 7919
		}

		var0.objectId = var3; // L: 7921
		var0.field1130 = var4; // L: 7922
		var0.field1128 = var5; // L: 7923
	} // L: 7924
}
