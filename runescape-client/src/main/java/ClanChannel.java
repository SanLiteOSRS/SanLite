import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eq")
@Implements("ClanChannel")
public class ClanChannel extends Node {
	@ObfuscatedName("fe")
	@ObfuscatedSignature(
		descriptor = "Llx;"
	)
	@Export("archive15")
	static Archive archive15;
	@ObfuscatedName("gf")
	@Export("secureRandom")
	static SecureRandom secureRandom;
	@ObfuscatedName("a")
	boolean field1733;
	@ObfuscatedName("f")
	boolean field1726;
	@ObfuscatedName("c")
	@Export("members")
	public List members;
	@ObfuscatedName("x")
	@Export("sortedMembers")
	int[] sortedMembers;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		longValue = 5837324716247821387L
	)
	long field1729;
	@ObfuscatedName("j")
	@Export("name")
	public String name;
	@ObfuscatedName("y")
	public byte field1725;
	@ObfuscatedName("d")
	public byte field1731;

	static {
		new BitSet(65536); // L: 22
	} // L: 23

	@ObfuscatedSignature(
		descriptor = "(Lqr;)V"
	)
	public ClanChannel(Buffer var1) {
		this.field1726 = true; // L: 13
		this.name = null; // L: 17
		this.method3209(var1); // L: 26
	} // L: 27

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(B)[I",
		garbageValue = "-16"
	)
	@Export("getSortedMembers")
	public int[] getSortedMembers() {
		if (this.sortedMembers == null) { // L: 30
			String[] var1 = new String[this.members.size()]; // L: 31
			this.sortedMembers = new int[this.members.size()]; // L: 32

			for (int var2 = 0; var2 < this.members.size(); this.sortedMembers[var2] = var2++) { // L: 33 35
				var1[var2] = ((ClanChannelMember)this.members.get(var2)).username.method8997(); // L: 34
			}

			TileItem.method2554(var1, this.sortedMembers); // L: 37
		}

		return this.sortedMembers; // L: 39
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lec;I)V",
		garbageValue = "823088173"
	)
	@Export("addMember")
	void addMember(ClanChannelMember var1) {
		this.members.add(var1); // L: 43
		this.sortedMembers = null; // L: 44
	} // L: 45

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "99729277"
	)
	@Export("removeMember")
	void removeMember(int var1) {
		this.members.remove(var1); // L: 48
		this.sortedMembers = null; // L: 49
	} // L: 50

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "36"
	)
	public int method3215() {
		return this.members.size(); // L: 53
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "971753480"
	)
	public int method3208(String var1) {
		if (!this.field1726) { // L: 57
			throw new RuntimeException("Displaynames not available");
		} else {
			for (int var2 = 0; var2 < this.members.size(); ++var2) { // L: 58
				if (((ClanChannelMember)this.members.get(var2)).username.getName().equalsIgnoreCase(var1)) {
					return var2; // L: 59
				}
			}

			return -1; // L: 61
		}
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(Lqr;B)V",
		garbageValue = "0"
	)
	void method3209(Buffer var1) {
		int var2 = var1.readUnsignedByte(); // L: 65
		if ((var2 & 1) != 0) { // L: 66
			this.field1733 = true;
		}

		if ((var2 & 2) != 0) { // L: 67
			this.field1726 = true;
		}

		int var3 = 2; // L: 68
		if ((var2 & 4) != 0) { // L: 69
			var3 = var1.readUnsignedByte();
		}

		super.key = var1.readLong(); // L: 70
		this.field1729 = var1.readLong(); // L: 71
		this.name = var1.readStringCp1252NullTerminated(); // L: 72
		var1.readBoolean(); // L: 73
		this.field1731 = var1.readByte(); // L: 74
		this.field1725 = var1.readByte(); // L: 75
		int var4 = var1.readUnsignedShort(); // L: 76
		if (var4 > 0) { // L: 77
			this.members = new ArrayList(var4); // L: 78

			for (int var5 = 0; var5 < var4; ++var5) { // L: 79
				ClanChannelMember var6 = new ClanChannelMember(); // L: 80
				if (this.field1733) { // L: 81
					var1.readLong(); // L: 82
				}

				if (this.field1726) { // L: 84
					var6.username = new Username(var1.readStringCp1252NullTerminated());
				}

				var6.rank = var1.readByte(); // L: 85
				var6.world = var1.readUnsignedShort(); // L: 86
				if (var3 >= 3) { // L: 87
					var1.readBoolean(); // L: 88
				}

				this.members.add(var5, var6); // L: 91
			}
		}

	} // L: 94

	@ObfuscatedName("li")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1457219972"
	)
	@Export("changeGameOptions")
	static final void changeGameOptions(int var0) {
		ItemComposition.method3786(); // L: 12201
		World.method1765(); // L: 12202
		int var1 = ClientPacket.VarpDefinition_get(var0).type; // L: 12203
		if (var1 != 0) { // L: 12204
			int var2 = Varps.Varps_main[var0]; // L: 12205
			if (var1 == 1) { // L: 12206
				if (var2 == 1) { // L: 12207
					GroundObject.method4134(0.9D);
				}

				if (var2 == 2) { // L: 12208
					GroundObject.method4134(0.8D);
				}

				if (var2 == 3) { // L: 12209
					GroundObject.method4134(0.7D);
				}

				if (var2 == 4) { // L: 12210
					GroundObject.method4134(0.6D);
				}
			}

			if (var1 == 3) { // L: 12212
				if (var2 == 0) { // L: 12213
					class20.method288(255);
				}

				if (var2 == 1) { // L: 12214
					class20.method288(192);
				}

				if (var2 == 2) { // L: 12215
					class20.method288(128);
				}

				if (var2 == 3) { // L: 12216
					class20.method288(64);
				}

				if (var2 == 4) { // L: 12217
					class20.method288(0);
				}
			}

			if (var1 == 4) { // L: 12219
				if (var2 == 0) { // L: 12220
					Message.method1150(127);
				}

				if (var2 == 1) { // L: 12221
					Message.method1150(96);
				}

				if (var2 == 2) { // L: 12222
					Message.method1150(64);
				}

				if (var2 == 3) { // L: 12223
					Message.method1150(32);
				}

				if (var2 == 4) { // L: 12224
					Message.method1150(0);
				}
			}

			if (var1 == 5) { // L: 12226
				Client.field719 = var2 == 1;
			}

			if (var1 == 6) {
				Client.chatEffects = var2; // L: 12227
			}

			if (var1 == 9) { // L: 12228
				Client.field671 = var2;
			}

			if (var1 == 10) { // L: 12229
				if (var2 == 0) { // L: 12230
					Calendar.method6226(127);
				}

				if (var2 == 1) { // L: 12231
					Calendar.method6226(96);
				}

				if (var2 == 2) { // L: 12232
					Calendar.method6226(64);
				}

				if (var2 == 3) { // L: 12233
					Calendar.method6226(32);
				}

				if (var2 == 4) { // L: 12234
					Calendar.method6226(0);
				}
			}

			if (var1 == 17) { // L: 12236
				Client.followerIndex = var2 & 65535; // L: 12237
			}

			if (var1 == 18) { // L: 12239
				Client.playerAttackOption = (AttackOption)DecorativeObject.findEnumerated(FriendSystem.method1778(), var2); // L: 12240
				if (Client.playerAttackOption == null) { // L: 12241
					Client.playerAttackOption = AttackOption.AttackOption_dependsOnCombatLevels;
				}
			}

			if (var1 == 19) { // L: 12243
				if (var2 == -1) { // L: 12244
					Client.combatTargetPlayerIndex = -1;
				} else {
					Client.combatTargetPlayerIndex = var2 & 2047; // L: 12245
				}
			}

			if (var1 == 22) { // L: 12247
				Client.npcAttackOption = (AttackOption)DecorativeObject.findEnumerated(FriendSystem.method1778(), var2); // L: 12248
				if (Client.npcAttackOption == null) { // L: 12249
					Client.npcAttackOption = AttackOption.AttackOption_dependsOnCombatLevels;
				}
			}

		}
	} // L: 12251
}
