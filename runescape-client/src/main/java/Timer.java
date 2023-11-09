import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mt")
@Implements("Timer")
public class Timer {
	@ObfuscatedName("eo")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	static Archive field4232;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		longValue = -8735945118853386879L
	)
	long field4228;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		longValue = -6918330546120993273L
	)
	long field4229;
	@ObfuscatedName("w")
	public boolean field4223;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		longValue = -1503783176874321879L
	)
	long field4225;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		longValue = -8793047518533873903L
	)
	long field4230;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		longValue = -5274063944958508639L
	)
	long field4227;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 1005291763
	)
	int field4224;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -1630081649
	)
	int field4226;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1043172727
	)
	int field4222;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -690606115
	)
	int field4231;

	public Timer() {
		this.field4228 = -1L; // L: 7
		this.field4229 = -1L; // L: 8
		this.field4223 = false; // L: 9
		this.field4225 = 0L; // L: 10
		this.field4230 = 0L; // L: 11
		this.field4227 = 0L; // L: 12
		this.field4224 = 0; // L: 13
		this.field4226 = 0; // L: 14
		this.field4222 = 0; // L: 15
		this.field4231 = 0; // L: 16
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-312486675"
	)
	public void method6457() {
		this.field4228 = class181.method3483(); // L: 19
	} // L: 20

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1669178431"
	)
	public void method6468() {
		if (-1L != this.field4228) { // L: 23
			this.field4230 = class181.method3483() - this.field4228; // L: 24
			this.field4228 = -1L; // L: 25
		}

	} // L: 27

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "100"
	)
	public void method6458(int var1) {
		this.field4229 = class181.method3483(); // L: 30
		this.field4224 = var1; // L: 31
	} // L: 32

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "3"
	)
	public void method6459() {
		if (-1L != this.field4229) { // L: 35
			this.field4225 = class181.method3483() - this.field4229; // L: 36
			this.field4229 = -1L; // L: 37
		}

		++this.field4222; // L: 39
		this.field4223 = true; // L: 40
	} // L: 41

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2084155545"
	)
	public void method6461() {
		this.field4223 = false; // L: 44
		this.field4226 = 0; // L: 45
	} // L: 46

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-494089145"
	)
	public void method6478() {
		this.method6459(); // L: 49
	} // L: 50

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Lqr;I)V",
		garbageValue = "37914891"
	)
	@Export("write")
	public void write(Buffer var1) {
		TextureProvider.method4269(var1, this.field4230); // L: 53
		TextureProvider.method4269(var1, this.field4225); // L: 54
		TextureProvider.method4269(var1, this.field4227); // L: 55
		var1.writeShort(this.field4224); // L: 56
		var1.writeShort(this.field4226); // L: 57
		var1.writeShort(this.field4222); // L: 58
		var1.writeShort(this.field4231); // L: 59
	} // L: 60

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(CLlv;B)C",
		garbageValue = "0"
	)
	@Export("standardizeChar")
	static char standardizeChar(char var0, Language var1) {
		if (var0 >= 192 && var0 <= 255) { // L: 117
			if (var0 >= 192 && var0 <= 198) { // L: 118
				return 'A';
			}

			if (var0 == 199) { // L: 119
				return 'C';
			}

			if (var0 >= 200 && var0 <= 203) { // L: 120
				return 'E';
			}

			if (var0 >= 204 && var0 <= 207) { // L: 121
				return 'I';
			}

			if (var0 == 209 && var1 != Language.Language_ES) { // L: 122
				return 'N';
			}

			if (var0 >= 210 && var0 <= 214) { // L: 123
				return 'O';
			}

			if (var0 >= 217 && var0 <= 220) { // L: 124
				return 'U';
			}

			if (var0 == 221) { // L: 125
				return 'Y';
			}

			if (var0 == 223) { // L: 126
				return 's';
			}

			if (var0 >= 224 && var0 <= 230) { // L: 127
				return 'a';
			}

			if (var0 == 231) { // L: 128
				return 'c';
			}

			if (var0 >= 232 && var0 <= 235) { // L: 129
				return 'e';
			}

			if (var0 >= 236 && var0 <= 239) { // L: 130
				return 'i';
			}

			if (var0 == 241 && var1 != Language.Language_ES) { // L: 131
				return 'n';
			}

			if (var0 >= 242 && var0 <= 246) { // L: 132
				return 'o';
			}

			if (var0 >= 249 && var0 <= 252) { // L: 133
				return 'u';
			}

			if (var0 == 253 || var0 == 255) { // L: 134
				return 'y';
			}
		}

		if (var0 == 338) { // L: 136
			return 'O';
		} else if (var0 == 339) { // L: 137
			return 'o';
		} else if (var0 == 376) { // L: 138
			return 'Y';
		} else {
			return var0; // L: 139
		}
	}
}
