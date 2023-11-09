import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rm")
@Implements("GraphicsDefaults")
public class GraphicsDefaults {
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 353948293
	)
	public int field4696;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -2086953849
	)
	public int field4694;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 822465487
	)
	public int field4699;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -1020769257
	)
	public int field4701;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 807246977
	)
	public int field4697;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -693216127
	)
	public int field4698;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 260382971
	)
	public int field4705;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -2044145205
	)
	public int field4700;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -687473611
	)
	public int field4702;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -37239833
	)
	public int field4704;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1522560543
	)
	public int field4703;

	public GraphicsDefaults() {
		this.field4696 = -1; // L: 7
		this.field4694 = -1; // L: 8
		this.field4699 = -1; // L: 9
		this.field4701 = -1; // L: 10
		this.field4697 = -1; // L: 11
		this.field4698 = -1; // L: 12
		this.field4705 = -1; // L: 13
		this.field4700 = -1; // L: 14
		this.field4702 = -1; // L: 15
		this.field4704 = -1; // L: 16
		this.field4703 = -1; // L: 17
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lnr;B)V",
		garbageValue = "-1"
	)
	@Export("decode")
	public void decode(AbstractArchive var1) {
		byte[] var2 = var1.takeFileFlat(DefaultsGroup.field4691.group); // L: 20
		Buffer var3 = new Buffer(var2); // L: 21

		while (true) {
			int var4 = var3.readUnsignedByte(); // L: 23
			if (var4 == 0) { // L: 24
				return; // L: 51
			}

			switch(var4) { // L: 25
			case 1:
				var3.readMedium(); // L: 31
				break; // L: 32
			case 2:
				this.field4696 = var3.method9077(); // L: 36
				this.field4694 = var3.method9077(); // L: 37
				this.field4699 = var3.method9077(); // L: 38
				this.field4701 = var3.method9077(); // L: 39
				this.field4697 = var3.method9077(); // L: 40
				this.field4698 = var3.method9077(); // L: 41
				this.field4705 = var3.method9077(); // L: 42
				this.field4700 = var3.method9077(); // L: 43
				this.field4702 = var3.method9077(); // L: 44
				this.field4704 = var3.method9077(); // L: 45
				this.field4703 = var3.method9077(); // L: 46
			}
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ILjava/lang/String;I)Z",
		garbageValue = "-1982821952"
	)
	static boolean method8142(String var0, int var1, String var2) {
		if (var1 == 0) { // L: 56
			try {
				if (!class31.field165.startsWith("win")) { // L: 58
					throw new Exception();
				} else if (!var0.startsWith("http://") && !var0.startsWith("https://")) { // L: 59
					throw new Exception();
				} else {
					String var10 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*"; // L: 60

					for (int var4 = 0; var4 < var0.length(); ++var4) { // L: 61
						if (var10.indexOf(var0.charAt(var4)) == -1) { // L: 62
							throw new Exception();
						}
					}

					Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var0 + "\""); // L: 64
					return true; // L: 65
				}
			} catch (Throwable var5) { // L: 67
				return false; // L: 68
			}
		} else if (var1 == 1) { // L: 71
			try {
				Object var3 = class26.method404(class31.field162, var2, new Object[]{(new URL(class31.field162.getCodeBase(), var0)).toString()}); // L: 73
				return var3 != null; // L: 74
			} catch (Throwable var6) { // L: 76
				return false; // L: 77
			}
		} else if (var1 == 2) { // L: 80
			try {
				class31.field162.getAppletContext().showDocument(new URL(class31.field162.getCodeBase(), var0), "_blank"); // L: 82
				return true; // L: 83
			} catch (Exception var7) { // L: 85
				return false; // L: 86
			}
		} else if (var1 == 3) { // L: 89
			try {
				class26.method403(class31.field162, "loggedout"); // L: 91
			} catch (Throwable var9) { // L: 93
			}

			try {
				class31.field162.getAppletContext().showDocument(new URL(class31.field162.getCodeBase(), var0), "_top"); // L: 95
				return true; // L: 96
			} catch (Exception var8) { // L: 98
				return false; // L: 99
			}
		} else {
			throw new IllegalArgumentException(); // L: 102
		}
	}
}
