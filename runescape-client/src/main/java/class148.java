import java.util.ArrayList;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ff")
public class class148 {
	@ObfuscatedName("ux")
	@ObfuscatedGetter(
		intValue = -37105280
	)
	static int field1663;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		longValue = -5997986403170915367L
	)
	long field1669;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -1589522901
	)
	public int field1661;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lpy;"
	)
	IterableNodeDeque field1662;

	@ObfuscatedSignature(
		descriptor = "(Lul;)V"
	)
	public class148(Buffer var1) {
		this.field1661 = -1; // L: 9
		this.field1662 = new IterableNodeDeque(); // L: 10
		this.method3171(var1); // L: 28
	} // L: 29

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lul;I)V",
		garbageValue = "-2147364614"
	)
	void method3171(Buffer var1) {
		this.field1669 = var1.readLong(); // L: 32
		this.field1661 = var1.readInt(); // L: 33

		for (int var2 = var1.readUnsignedByte(); var2 != 0; var2 = var1.readUnsignedByte()) { // L: 34 35
			Object var3;
			if (var2 == 3) { // L: 37
				var3 = new class167(this);
			} else if (var2 == 1) { // L: 38
				var3 = new class143(this);
			} else if (var2 == 13) { // L: 39
				var3 = new class160(this);
			} else if (var2 == 4) { // L: 40
				var3 = new class152(this);
			} else if (var2 == 6) { // L: 41
				var3 = new class159(this);
			} else if (var2 == 5) { // L: 42
				var3 = new class144(this);
			} else if (var2 == 2) { // L: 43
				var3 = new class149(this);
			} else if (var2 == 7) {
				var3 = new class142(this);
			} else if (var2 == 14) {
				var3 = new class146(this);
			} else if (var2 == 8) { // L: 46
				var3 = new class163(this);
			} else if (var2 == 9) { // L: 47
				var3 = new class169(this);
			} else if (var2 == 10) {
				var3 = new class155(this); // L: 48
			} else if (var2 == 11) { // L: 49
				var3 = new class150(this);
			} else if (var2 == 12) { // L: 50
				var3 = new class154(this);
			} else {
				if (var2 != 15) { // L: 51
					throw new RuntimeException("");
				}

				var3 = new class164(this);
			}

			((class145)var3).vmethod3414(var1);
			this.field1662.addFirst((Node)var3); // L: 54
		}

	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lgi;I)V",
		garbageValue = "-170736557"
	)
	public void method3167(ClanSettings var1) {
		if (this.field1669 == var1.field1703 && this.field1661 == var1.field1704) {
			for (class145 var2 = (class145)this.field1662.last(); var2 != null; var2 = (class145)this.field1662.previous()) { // L: 61
				var2.vmethod3415(var1);
			}

			++var1.field1704;
		} else {
			throw new RuntimeException("");
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(II)Lhp;",
		garbageValue = "-1776229004"
	)
	@Export("WorldMapElement_get")
	public static WorldMapElement WorldMapElement_get(int var0) {
		return var0 >= 0 && var0 < WorldMapElement.WorldMapElement_cached.length && WorldMapElement.WorldMapElement_cached[var0] != null ? WorldMapElement.WorldMapElement_cached[var0] : new WorldMapElement(var0); // L: 44 45
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)[B",
		garbageValue = "-2128582813"
	)
	@Export("ByteArrayPool_getArray")
	public static synchronized byte[] ByteArrayPool_getArray(int var0) {
		return ByteArrayPool.ByteArrayPool_getArrayBool(var0, false); // L: 92
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/ArrayList;IIIIZB)V",
		garbageValue = "7"
	)
	public static void method3166(ArrayList var0, int var1, int var2, int var3, int var4, boolean var5) {
		if (!var0.isEmpty()) { // L: 52
			class319.field3428.clear(); // L: 55
			class319.field3435.clear(); // L: 56
			Script.method2215(var5); // L: 57
			GrandExchangeOfferNameComparator.method7053(var0, var5); // L: 58
			if (!class319.field3428.isEmpty()) { // L: 59
				MouseHandler.method682(var1, var2, var3, var4); // L: 62
				class319.field3435.add(new class414((class421)null)); // L: 63
				class319.field3435.add(new class423((class421)null, class319.field3439, class319.field3429, class319.field3432)); // L: 64
				ArrayList var6 = new ArrayList(); // L: 65
				var6.add(new class418(new class420((class421)null, 0, true, class319.field3430))); // L: 66
				if (!class319.field3433.isEmpty()) { // L: 67
					ArrayList var7 = new ArrayList(); // L: 68
					var7.add(new class417(new class422((class421)null, var6), class319.field3436)); // L: 69
					ArrayList var9 = new ArrayList(); // L: 72
					Iterator var10 = class319.field3433.iterator(); // L: 73

					while (var10.hasNext()) {
						class331 var11 = (class331)var10.next(); // L: 74
						var9.add(var11); // L: 76
					}

					var7.add(new class417(new class419(new class416((class421)null, var9), 0, false, class319.field3438), class319.field3437)); // L: 82
					class319.field3435.add(new class422((class421)null, var7)); // L: 83
				} else {
					class319.field3435.add(new class417((class421)null, class319.field3436)); // L: 86
					class319.field3435.add(new class422((class421)null, var6)); // L: 87
				}

			}
		}
	} // L: 53 60 89

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1919662235"
	)
	static void method3175() {
		Login.Login_username = Login.Login_username.trim(); // L: 1162
		if (Login.Login_username.length() == 0) { // L: 1163
			AbstractWorldMapIcon.setLoginResponseString("", "Please enter your username/email address.", ""); // L: 1164
		} else if (Login.Login_password.length() == 0) { // L: 1167
			AbstractWorldMapIcon.setLoginResponseString("", "Please enter your password.", ""); // L: 1168
		} else {
			AbstractWorldMapIcon.setLoginResponseString("", "Connecting to server...", ""); // L: 1171
			UserComparator6.method2942(false); // L: 1172
			DefaultsGroup.method8263(20); // L: 1173
		}
	} // L: 1165 1169 1174

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;IB)V",
		garbageValue = "49"
	)
	static final void method3179(String var0, int var1) {
		PacketBufferNode var2 = ClanChannelMember.getPacketBufferNode(ClientPacket.field3135, Client.packetWriter.isaacCipher); // L: 212
		var2.packetBuffer.writeByte(class478.stringCp1252NullTerminatedByteSize(var0) + 1); // L: 213
		var2.packetBuffer.writeStringCp1252NullTerminated(var0); // L: 214
		var2.packetBuffer.method9234(var1); // L: 215
		Client.packetWriter.addNode(var2); // L: 216
	} // L: 217

	@ObfuscatedName("hb")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-54"
	)
	static final void method3177() {
		if (Client.logoutTimer > 0) { // L: 3069
			CollisionMap.method4301(); // L: 3070
		} else {
			Client.timer.method7836(); // L: 3073
			DefaultsGroup.method8263(40); // L: 3074
			class11.field59 = Client.packetWriter.getSocket(); // L: 3075
			Client.packetWriter.removeSocket(); // L: 3076
		}
	} // L: 3071 3077
}
