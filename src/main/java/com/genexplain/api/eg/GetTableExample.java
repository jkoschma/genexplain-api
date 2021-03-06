/**
 * Copyright (C) 2017 geneXplain GmbH, Wolfenbuettel, Germany
 *
 * Author: Philip Stegmaier
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY 
 * OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT
 * LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS
 * FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO
 * EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE 
 * LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, 
 * WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE,
 * ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE
 * OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 *
 */
package com.genexplain.api.eg;

import org.slf4j.LoggerFactory;

import com.eclipsesource.json.JsonObject;

/**
 * @author pst
 */
@GxAPIExample(name="getTable", description="Gets a JSON response representing a data table and prints it to standard output")
public class GetTableExample extends AbstractAPIExample {
    
    public GetTableExample() {
        logger = LoggerFactory.getLogger(this.getClass());
    }
    
    /* (non-Javadoc)
     * @see com.genexplain.api.eg.AbstractAPIExample#run()
     */
    @Override
    public void run() throws Exception {
        connect();
        JsonObject result = client.getTable("data/Examples/Encode TFBS CEBPB in H1-hESC cells/Data/ChIPMunk/CEBP H1-hESC cells motif profile CEBP in H1-hESC cells YES roc 50");
        logger.info(result.toString());
    }

    @Override
    void run(String[] args) throws Exception {
        run();
    }

}
