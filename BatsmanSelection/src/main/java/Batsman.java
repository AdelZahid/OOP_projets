/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author adelz
 */
public class Batsman {
    private Integer totalRuns;
    private Integer totalOuts;
    Batsman(int TR,int TO)
    {
      this.totalRuns=TR;
      this.totalOuts=TO;
    }
    public Integer getTotalRuns(){
        return this.totalRuns;
    }
    public Integer getTotalOuts(){
        return this.totalOuts;
        }
        public void setTotalRuns(Integer TR){
            this.totalRuns=TR;
            }
            public void setTotalOuts(Integer TO){
                this.totalOuts=TO;
                }
}
