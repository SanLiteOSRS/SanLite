import java.util.Arrays;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ia")
public class class228 implements class29 {
	@ObfuscatedName("az")
	char[] field2433;
	@ObfuscatedName("ah")
	int[] field2429;
	@ObfuscatedName("af")
	public int[] field2432;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 84453187
	)
	public int field2431;
	@ObfuscatedName("an")
	int[] field2441;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -196340985
	)
	int field2430;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 646837141
	)
	int field2434;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 366454471
	)
	int field2435;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -1628134909
	)
	int field2436;
	@ObfuscatedName("al")
	boolean[] field2437;
	@ObfuscatedName("as")
	boolean[] field2438;
	@ObfuscatedName("ag")
	boolean[] field2439;
	@ObfuscatedName("ai")
	public char field2428;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 1730330137
	)
	public int field2440;

	public class228() {
		this.field2433 = new char[128]; // L: 8
		this.field2429 = new int[128]; // L: 9
		this.field2432 = new int[128]; // L: 10
		this.field2431 = 0; // L: 11
		this.field2441 = new int[128]; // L: 12
		this.field2430 = 0;
		this.field2434 = 0; // L: 14
		this.field2435 = 0; // L: 15
		this.field2436 = 0; // L: 16
		this.field2437 = new boolean[112]; // L: 17
		this.field2438 = new boolean[112]; // L: 18
		this.field2439 = new boolean[112]; // L: 19
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "743662152"
	)
	public boolean vmethod4317(int var1) {
		this.method4313(var1); // L: 24
		this.field2437[var1] = true; // L: 25
		this.field2438[var1] = true; // L: 26
		this.field2439[var1] = false; // L: 27
		this.field2432[++this.field2431 - 1] = var1; // L: 28
		return true; // L: 29
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "-99"
	)
	public boolean vmethod4312(int var1) {
		this.field2437[var1] = false; // L: 33
		this.field2438[var1] = false; // L: 34
		this.field2439[var1] = true; // L: 35
		this.field2441[++this.field2430 - 1] = var1; // L: 36
		return true; // L: 37
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "-1370736452"
	)
	public boolean vmethod4324(char var1) {
		int var2 = this.field2435 + 1 & 127; // L: 41
		if (var2 != this.field2434) { // L: 42
			this.field2429[this.field2435] = -1; // L: 43
			this.field2433[this.field2435] = var1; // L: 44
			this.field2435 = var2; // L: 45
		}

		return false; // L: 47
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(ZB)Z",
		garbageValue = "-10"
	)
	public boolean vmethod4339(boolean var1) {
		return false; // L: 60
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "104"
	)
	void method4313(int var1) {
		int var2 = this.field2435 + 1 & 127; // L: 51
		if (var2 != this.field2434) { // L: 52
			this.field2429[this.field2435] = var1; // L: 53
			this.field2433[this.field2435] = 0; // L: 54
			this.field2435 = var2; // L: 55
		}

	} // L: 57

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1201094471"
	)
	public void method4327() {
		this.field2434 = this.field2436; // L: 64
		this.field2436 = this.field2435; // L: 65
		this.field2431 = 0; // L: 66
		this.field2430 = 0; // L: 67
		Arrays.fill(this.field2438, false); // L: 68
		Arrays.fill(this.field2439, false); // L: 69
	} // L: 70

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1399664256"
	)
	public final boolean method4337() {
		if (this.field2434 == this.field2436) { // L: 73
			return false;
		} else {
			this.field2440 = this.field2429[this.field2434]; // L: 74
			this.field2428 = this.field2433[this.field2434]; // L: 75
			this.field2434 = this.field2434 + 1 & 127; // L: 76
			return true; // L: 77
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "911395944"
	)
	public boolean method4333(int var1) {
		return var1 >= 0 && var1 < 112 ? this.field2438[var1] : false; // L: 81 82
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IS)Z",
		garbageValue = "16384"
	)
	public boolean method4318(int var1) {
		return var1 >= 0 && var1 < 112 ? this.field2437[var1] : false; // L: 86 87
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "-71"
	)
	public boolean method4319(int var1) {
		return var1 >= 0 && var1 < 112 ? this.field2439[var1] : false; // L: 91 92
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "-1878249396"
	)
	public int[] method4320() {
		int[] var1 = new int[this.field2431]; // L: 96

		for (int var2 = 0; var2 < this.field2431; ++var2) { // L: 97
			var1[var2] = this.field2432[var2]; // L: 98
		}

		return var1; // L: 100
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "-906504621"
	)
	public int[] method4321() {
		int[] var1 = new int[this.field2430]; // L: 104

		for (int var2 = 0; var2 < this.field2430; ++var2) { // L: 105
			var1[var2] = this.field2441[var2]; // L: 106
		}

		return var1; // L: 108
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)I",
		garbageValue = "2"
	)
	static final int method4316(int var0, int var1, int var2, int var3) {
		return var0 * var2 - var3 * var1 >> 16; // L: 13
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1327677232"
	)
	static void method4350() {
		if ((Client.worldProperties & class530.field5214.rsOrdinal()) != 0) { // L: 1036
			Login.Login_response0 = ""; // L: 1037
			Login.Login_response1 = "This is a <col=00ffff>Beta<col=ffffff> world."; // L: 1038
			Login.Login_response2 = "Your normal account will not be affected."; // L: 1039
			Login.Login_response3 = ""; // L: 1040
			class210.method3930(1); // L: 1041
			Friend.method8099(); // L: 1042
		} else if ((Client.worldProperties & class530.field5221.rsOrdinal()) != 0) { // L: 1044
			if ((Client.worldProperties & class530.field5199.rsOrdinal()) != 0) { // L: 1045
				Login.Login_response1 = "This is a <col=ffff00>High Risk <col=ff0000>PvP<col=ffffff> world."; // L: 1046
				Login.Login_response2 = "Players can attack each other almost everywhere"; // L: 1047
				Login.Login_response3 = "and the Protect Item prayer won't work."; // L: 1048
			} else {
				Login.Login_response1 = "This is a <col=ff0000>PvP<col=ffffff> world."; // L: 1051
				Login.Login_response2 = "Players can attack each other"; // L: 1052
				Login.Login_response3 = "almost everywhere."; // L: 1053
			}

			Login.Login_response0 = "Warning!"; // L: 1055
			class210.method3930(1); // L: 1056
			Friend.method8099(); // L: 1057
		} else if ((Client.worldProperties & class530.field5199.rsOrdinal()) != 0) { // L: 1059
			Login.Login_response1 = "This is a <col=ffff00>High Risk<col=ffffff> world."; // L: 1060
			Login.Login_response2 = "The Protect Item prayer will"; // L: 1061
			Login.Login_response3 = "not work on this world."; // L: 1062
			Login.Login_response0 = "Warning!"; // L: 1063
			class210.method3930(1); // L: 1064
			Friend.method8099(); // L: 1065
		} else {
			class130.Login_promptCredentials(false); // L: 1068
		}

	} // L: 1070
}
