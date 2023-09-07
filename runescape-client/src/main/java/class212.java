import java.util.Arrays;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iz")
public class class212 implements class29 {
	@ObfuscatedName("au")
	char[] field2363;
	@ObfuscatedName("ae")
	int[] field2367;
	@ObfuscatedName("ao")
	public int[] field2358;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -2122790357
	)
	public int field2359;
	@ObfuscatedName("ac")
	int[] field2360;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 2074848823
	)
	int field2361;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 2039492397
	)
	int field2368;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1576200325
	)
	int field2362;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -399975453
	)
	int field2364;
	@ObfuscatedName("af")
	boolean[] field2365;
	@ObfuscatedName("ad")
	boolean[] field2366;
	@ObfuscatedName("aq")
	boolean[] field2357;
	@ObfuscatedName("al")
	public char field2356;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 36436435
	)
	public int field2369;

	public class212() {
		this.field2363 = new char[128]; // L: 8
		this.field2367 = new int[128]; // L: 9
		this.field2358 = new int[128]; // L: 10
		this.field2359 = 0; // L: 11
		this.field2360 = new int[128]; // L: 12
		this.field2361 = 0; // L: 13
		this.field2368 = 0; // L: 14
		this.field2362 = 0; // L: 15
		this.field2364 = 0; // L: 16
		this.field2365 = new boolean[112]; // L: 17
		this.field2366 = new boolean[112]; // L: 18
		this.field2357 = new boolean[112]; // L: 19
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1089015731"
	)
	public boolean vmethod4117(int var1) {
		this.method4129(var1); // L: 24
		this.field2365[var1] = true; // L: 25
		this.field2366[var1] = true; // L: 26
		this.field2357[var1] = false; // L: 27
		this.field2358[++this.field2359 - 1] = var1;
		return true;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1292750960"
	)
	public boolean vmethod4139(int var1) {
		this.field2365[var1] = false;
		this.field2366[var1] = false; // L: 34
		this.field2357[var1] = true;
		this.field2360[++this.field2361 - 1] = var1; // L: 36
		return true; // L: 37
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "-352714805"
	)
	public boolean vmethod4106(char var1) {
		int var2 = this.field2362 + 1 & 127; // L: 41
		if (var2 != this.field2368) { // L: 42
			this.field2367[this.field2362] = -1; // L: 43
			this.field2363[this.field2362] = var1; // L: 44
			this.field2362 = var2; // L: 45
		}

		return false; // L: 47
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(ZI)Z",
		garbageValue = "-1559971994"
	)
	public boolean vmethod4132(boolean var1) {
		return false; // L: 60
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "25"
	)
	void method4129(int var1) {
		int var2 = this.field2362 + 1 & 127; // L: 51
		if (var2 != this.field2368) { // L: 52
			this.field2367[this.field2362] = var1; // L: 53
			this.field2363[this.field2362] = 0; // L: 54
			this.field2362 = var2; // L: 55
		}

	} // L: 57

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "831915412"
	)
	public void method4108() {
		this.field2368 = this.field2364; // L: 64
		this.field2364 = this.field2362; // L: 65
		this.field2359 = 0; // L: 66
		this.field2361 = 0; // L: 67
		Arrays.fill(this.field2366, false); // L: 68
		Arrays.fill(this.field2357, false); // L: 69
	} // L: 70

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1344001483"
	)
	public final boolean method4124() {
		if (this.field2368 == this.field2364) { // L: 73
			return false;
		} else {
			this.field2369 = this.field2367[this.field2368]; // L: 74
			this.field2356 = this.field2363[this.field2368]; // L: 75
			this.field2368 = this.field2368 + 1 & 127; // L: 76
			return true; // L: 77
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1783943803"
	)
	public boolean method4110(int var1) {
		return var1 >= 0 && var1 < 112 ? this.field2366[var1] : false; // L: 81 82
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-182514708"
	)
	public boolean method4120(int var1) {
		return var1 >= 0 && var1 < 112 ? this.field2365[var1] : false; // L: 86 87
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "13"
	)
	public boolean method4105(int var1) {
		return var1 >= 0 && var1 < 112 ? this.field2357[var1] : false; // L: 91 92
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "-390851826"
	)
	public int[] method4113() {
		int[] var1 = new int[this.field2359]; // L: 96

		for (int var2 = 0; var2 < this.field2359; ++var2) { // L: 97
			var1[var2] = this.field2358[var2]; // L: 98
		}

		return var1; // L: 100
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(B)[I",
		garbageValue = "60"
	)
	public int[] method4114() {
		int[] var1 = new int[this.field2361]; // L: 104

		for (int var2 = 0; var2 < this.field2361; ++var2) { // L: 105
			var1[var2] = this.field2360[var2]; // L: 106
		}

		return var1; // L: 108
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IIS)I",
		garbageValue = "24356"
	)
	static int method4145(int var0, int var1) {
		ItemContainer var2 = (ItemContainer)ItemContainer.itemContainers.get((long)var0); // L: 28
		if (var2 == null) { // L: 29
			return 0;
		} else if (var1 == -1) { // L: 30
			return 0;
		} else {
			int var3 = 0; // L: 31

			for (int var4 = 0; var4 < var2.quantities.length; ++var4) { // L: 32
				if (var2.ids[var4] == var1) {
					var3 += var2.quantities[var4]; // L: 33
				}
			}

			return var3; // L: 35
		}
	}

	@ObfuscatedName("mp")
	@ObfuscatedSignature(
		descriptor = "([Lmi;IB)V",
		garbageValue = "-27"
	)
	@Export("runComponentCloseListeners")
	static final void runComponentCloseListeners(Widget[] var0, int var1) {
		for (int var2 = 0; var2 < var0.length; ++var2) { // L: 11950
			Widget var3 = var0[var2]; // L: 11951
			if (var3 != null) { // L: 11952
				if (var3.type == 0) { // L: 11953
					if (var3.children != null) { // L: 11954
						runComponentCloseListeners(var3.children, var1);
					}

					InterfaceParent var4 = (InterfaceParent)Client.interfaceParents.get((long)var3.id); // L: 11955
					if (var4 != null) { // L: 11956
						class385.runIntfCloseListeners(var4.group, var1);
					}
				}

				ScriptEvent var5;
				if (var1 == 0 && var3.onDialogAbort != null) { // L: 11958
					var5 = new ScriptEvent(); // L: 11959
					var5.widget = var3; // L: 11960
					var5.args = var3.onDialogAbort; // L: 11961
					WorldMapSection1.runScriptEvent(var5); // L: 11962
				}

				if (var1 == 1 && var3.onSubChange != null) { // L: 11964
					if (var3.childIndex >= 0) { // L: 11965
						Widget var6 = class92.getWidget(var3.id); // L: 11966
						if (var6 == null || var6.children == null || var3.childIndex >= var6.children.length || var3 != var6.children[var3.childIndex]) { // L: 11967
							continue;
						}
					}

					var5 = new ScriptEvent(); // L: 11971
					var5.widget = var3; // L: 11972
					var5.args = var3.onSubChange; // L: 11973
					WorldMapSection1.runScriptEvent(var5); // L: 11974
				}
			}
		}

	} // L: 11977
}
